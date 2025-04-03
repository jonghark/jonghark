package examples.timestamp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStamp {


    public static void main(String[] args) {

        // 입력 문자열
          String input = "2025-04-02 10:30:00";

          // 포맷터 정의
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

          // 문자열을 LocalDateTime으로 변환
          LocalDateTime dateTime = LocalDateTime.parse(input, formatter);

          // 하루 전으로 변경
          LocalDateTime yesterday = dateTime.minusDays(1);

          // 결과 문자열로 포맷
          String result = yesterday.format(formatter);


    }


}
