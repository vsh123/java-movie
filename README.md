## 오프라인 코딩 테스트 - 영화예매

## 기능 구현 목록
1. [예약]예매 가능한 목록을 출력해주고 예매할 영화를 입력해주는 기능
    * [예외처리] 상영목록에 없는 영화를 선택한 경우
    * [예외처리] 숫자가 아닌 수를 입력한 경우
 
1. [예약]예약할 시간표를 묻는 기능경우
    * [예외처리] 선택한 영화가 기존에 예매한 영화와 시간들과 1시간 이내가 아닌 
    * [예외처리] 상영 시작 시간이 이미 지난 영화를 선택하는 경우
    * [예외처리] 스케줄에 없는 번호를 입력하였을 때
    
1. [예약]예약할 인원을 묻는 기능
    * [예외처리] 예약 가능한 인원을 초과하였을 때
    * [예외처리] 예약 인원이 0명 이하일 때

1. [예약]예약 목록에 추가 기능
    * 해당 스케줄 예매 인원 감소 -> 0명이면 스케줄 삭제
    
1. [예약]추가 예매 여부를 묻는 기능
    * 추가예매를 안 할 경우 -> 예매한 목록을 보여 줌
    * 추가예매를 할 경우 -> 1번으로 돌아감
    
1. [예약]같은 영화를 다시 예매 했을 때 합치는 기능
    
1. [결제]포인트 사용 금액을 입력받는 기능
    * [예외처리] 입력한 포인트가 0 미만인 경우
    * [예외처리] 입력한 포인트가 결제 금액을 넘을 경우
    
1. [결제]신용카드, 현금 여부를 묻는 기능
    * [예외처리] 1,2번이 아닌 다른 번호를 입력한 경우
    
[TO_DO_LIST]
1, 한시간 이내의 영화가 없을 경우 뒤로가기