package org.example.chapter14;
// == 직원 관리 시스템 == //

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 직원 데이터 정의
@AllArgsConstructor // @setter 역할
@Getter
@ToString
class Employee {
    private String department;
    private String name;
    private int salary;
}
public class K_Practice {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("IT","이승아", 300),
                new Employee("HR","조승범", 500),
                new Employee("IT","김준일", 400),
                new Employee("OP","전예찬", 350),
                new Employee("HR","윤대휘", 380)
        );

        // 1. 급여가 400 이상인 직원 '필터링'
        // : filter() - 조건을 검사해서 true인 요소만을 다시 반환
        List<Employee> filteredEmployee = employees.stream()
                .filter(e -> e.getSalary() >= 400)
                .toList();

        filteredEmployee.forEach(System.out::println);

        // 2. IT 부서 직원의 이름만 추출
        // 1) 부서(department)가 'IT'인 직원을 필터링 - filter
        // 2) 부서가 'IT'인 직원 목록을 전체 순회하여 이름만 추출 - map
        List<String> departmentIt = employees.stream()
                .filter(e -> "IT".equals(e.getDepartment()))
                .map(Employee::getName)
                .toList();
        System.out.println("IT 부서 직원 이름");
        System.out.println(departmentIt);


        // 3. 특정 부서(HR) 직원 중 이름에 '조'가 포함된 직원 필터링
        // 1) 부서가 'HR'인 직원을 필터링 >> equals
        // 2) 위의 목록 중 이름에 '조'가 포함된 직원을 필터링 >> contains

        List<Employee> employeesWithJo = employees.stream()
                        .filter(e -> e.getDepartment().equals("HR"))
                        .filter(e -> e.getName().contains("조"))
                                .toList();

        System.out.println("=== 3번 ===");
        employeesWithJo.forEach(System.out::println);
        employeesWithJo.forEach(e -> System.out.println(e.getName()));
        // 4. 부서별 직원 그룹화
        // Collectors 클래스 - groupingBy
        //      >> Map 인터페이스 반환
        Map<String, List<Employee>> employeeByDept = employees.stream()
               // .collect(Collectors.groupingBy(e -> e.getDepartment()));
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(employeeByDept);

        for (Map.Entry<String, List<Employee>> entry: employeeByDept.entrySet()) {
            String department = entry.getKey();
            List<Employee> employeesInDept = entry.getValue();

            System.out.println(department + ": ");
            for (Employee employee: employeesInDept) {
                System.out.println(employee.getName() + " ");
            }
            System.out.println();
        }

        employeeByDept.forEach((department, employeeInDept) -> {
            String name = employeeInDept.stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(" "));
            System.out.println(department + ": " + name);
       });

        // 5. 부서별(그룹화) 평균 급여 계산
        // Collectors 클래스 - groupingBy
        //                  - averaging타입: 해당 타입의 편균을 계산(averagingInt(각 직원의 급여 전달))
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));
        System.out.println(avgSalaryByDept);
    }
}
