package project.java12deploy.response;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NumberRes {
     Long id;
     int num1;
     int num2;
     char operation;
}
