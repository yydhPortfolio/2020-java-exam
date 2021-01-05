# java-exam-2020 java로 만든 여러가지 간단한 콘솔로 사용하는 기능들

<h2>구현기능리스트</h2>
<div>
 <h3>step1</h3>
    <ul>
        <li>
                <pre>과락[문제]
1. 아래 세 과목의 성적 평균이 60점 이상이면 합격생이다.
2. 단, 어느 한 과목이라도 점수가 50점 미만이면 불합격생이다.
3. 합격 여부를 출력한다.</pre>
            </li>
            <li>
                <pre>값 교체[문제]
1. x와 y의 값을 교체한다.
2. 교체 후, 결과를 출력하면 다음과 같다.
정답)
x = 20
y = 10</pre>
            </li>
            <li>
                <pre>화폐매수[문제]
해당 금액의 화폐 종류 별 화폐 매수를 출력한다.
정답)
5만원 : 1장
1만원 : 3장
5천원 : 1장
1천원 : 2장
5백원 : 1개
1백원 : 4개</pre>
            </li>
        </ul>
    </div>
    <div>
        <h3>step2</h3>
        <ul>
            <li>
                <pre>로그인(3단계)[문제]
1. ID를 입력받아 dbId와 일치여부를 확인한다.
2. ID가 틀리면, "ID를 확인해주세요."라는 메세지를 출력한다.
3. ID가 맞으면, PW를 입력할 수 있다.
4. PW를 입력받아 dbPW와 일치여부를 확인한다.
5. PW가 틀리면, "PW를 확인해주세요."라는 메세지를 출력한다.
6. PW가 맞으면, "로그인 성공"이라는 메세지를 출력한다.</pre>
            </li>
            <li>
                <pre>놀이기구 이용제한[문제]
1. 키를 입력받는다.
2. 키가 110 이상이면, 놀이기구 이용이 가능하다.
3. 키가 110 미만이면, 놀이기구를 이용할 수 없다.
4. 단, 부모님과 함께 온 경우에는 놀이기구를 이용할 수 있다.
5. 부모님과의 동행여부를 1(yes) 또는 0(no)을 입력받아 확인한다.</pre>
            </li>
            <li>
                <pre>ATM[문제]
[1]로그인
. 계좌번호와 비밀번호를 입력받아 로그인을 처리한다.
. 이미 로그인 된 상태에서 다시 이용할 수 없다.
[2]로그아웃
. 로그아웃 상태에서 이용할 수 없다.
[3]입금
. 로그인 상태에서 이용할 수 있다.
. 입금할 금액을 입력받아 입금을 진행한다.
[4]출금
. 로그인 상태에서 이용할 수 있다.
. 출금할 금액이 계좌잔액을 초과할 경우 출금을 진행할 수 없다.
[5]이체
. 로그인 상태에서 이용할 수 있다.
. 이체할 계좌번호를 입력받아 처리한다.
. 이체할 금액이 계좌잔액을 초과할 경우 이체를 진행할 수 없다.
[6]잔액조회
. 로그인 상태에서 이용할 수 있다.
. 로그인 된 회원의 계좌잔액을 출력한다.</pre>
            </li>
        </ul>
    </div>
    <div>
        <h3>step3</h3>
        <ul>
            <li>
                <pre>구구단 게임(3단계)[문제]
1. 랜덤 숫자를 2개 저장하여,
2. 구구단 문제를 5회 출제한다.
3. 한 문제당 20점으로 게임 종료 후 게임성적을 출력한다.</pre>
            </li>
            <li>
                <pre>영수증 출력(2단계)[문제]
1. 메뉴판의 번호를 입력받아 주문을 받는다.
2. 계산하기를 누르면, 영수증을 출력한다.
3. 돈을 입력받아, 잔돈을 출력한다.</pre>
            </li>
            <li>
                <pre>랜덤학생[문제]
1. 10회 반복을 한다.
2. 1~100 사이의 랜덤 숫자를 저장한다.
3. 위 숫자가 60점 이상이면, 합격생이다.
4. 10명 학생의 총점과 평균을 출력한다.
5. 합격생 수를 출력한다.
6. 1등학생의 번호와 성적을 출력한다.
예) 87 11 92 42 100 23 68 33 8 75
[1] 총점 = 539점
[2] 평균 = 53.9점
[3] 합격생 수 = 5명
[4] 1등 = 100점(5번)</pre>
            </li>
            <li>
                <pre>쇼핑몰 뒤로가기[문제]
[1]남성의류
    (1) 티셔츠
    (2) 바지
    (3) 뒤로가기
[2]여성의류
    (1) 가디건
    (2) 치마
    (3) 뒤로가기
[0]종료</pre>
            </li>
        </ul>
    </div>
    <div>
        <h3>step4</h3>
        <ul>
            <li>
                <pre>OMR카드[문제]
1. 배열 answer는 시험문제의 정답지이다.
2. 배열 student에 1~5 사이의 랜덤 숫자 5개를 저장한다.
3. answer와 student 값을 비교해 정오표를 출력한다.
4. 한 문제당 20점이다.
예)
answer  = {1, 3, 4, 2, 5}
student = {1, 1, 4, 4, 3}
정오표  = {O, X, O, X, X}
성적    = 40점</pre>
            </li>
            <li>
                <pre>영화관 좌석예매[문제]
1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
4. 한 좌석당 예매 가격은 12000원이다.
5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
예)
seat = 0 0 0 0 0 0 0
좌석선택 : 1
seat = 0 1 0 0 0 0 0
좌석선택 : 3
seat = 0 1 0 1 0 0 0
좌석선택 : 3
seat = 0 1 0 1 0 0 0
이미 예매가 완료된 자리입니다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡ
매출액 : 24000원</pre>
            </li>
            <li>
                <pre>배열 컨트롤러(1단계)[문제]
1) 추가
2) 삭제
3) 삽입</pre>
            </li>
            <li>
                <pre>ATM(3단계)[문제]
1. 가입
. 계좌번호와 비밀번호를 입력받아 가입
. 계좌번호 중복검사
2. 탈퇴
. 계좌번호를 입력받아 탈퇴</pre>
            </li>
            <li>
                <pre>셔플[문제]
1. 100번을 반복한다.
2. 0~9사이의 랜덤한 숫자를 저장한다.
3. arr의 0번째 값과 arr의 위 랜덤 숫자 위치의 값을 교체한다.
4. 이를 통해 arr 배열의 값을 섞을 수 있다.</pre>
            </li>
        </ul>
    </div>
    <div>
        <h3>step5</h3>
        <ul>
            <li>
                <pre>최대값 구하기(3단계)[문제]
1. 가장 큰 값을 찾아 입력한다.
2. 정답이면 해당 값을 0으로 변경한다.
3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
예)
11, 87, 42, 100, 24
입력 : 100

11, 87, 42, 0, 24
입력 : 87

11, 0, 42, 0, 24</pre>
            </li>
            <li>
                <pre>정렬하기[문제]
1. 인덱스 0번이 나머지를 검사한다.
2. 제일 큰 값을 찾아 교환한다.
3. 인덱스 1증가한다.
4. [1~3]을 끝까지 반복한다.
예)
10, 50, 30, 40, 80, 7
80, 50, 30, 40, 10, 7
80, 50, 30, 40, 10, 7
80, 50, 40, 30, 10, 7</pre>
            </li>
            <li>
                <pre>관리비[문제]
문제 1) 각층별 관리비 합 출력
정답 1) 4400, 7100, 5400

문제 2) 호를 입력하면 관리비 출력
예 2) 입력 : 202 관리비 출력 : 2000

문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)

문제 4) 호 2개를 입력하면 관리비 교체</pre>
            </li>
        </ul>
    </div>
    <div>
        <h3>step6</h3>
        <ul>
            <li>
                <pre>학생성적관리 프로그램(1단계)[문제]
문제 1) 전체 합 출력
정답 1) 362

문제 2) 4의 배수의 합 출력
정답 2) 264

문제 3) 4의 배수의 개수 출력
정답 3) 3

문제 4) 짝수의 개수 출력
정답 4) 3</pre>
            </li>
            <li>
                <pre>학생성적관리 프로그램(2단계)[문제]
문제1) scores배열에 1~100점 사이의 정수를 5개 저장
예 1) 87, 11, 92, 14, 47

문제2) 전교생의 총점과 평균 출력
예 2) 총점(251) 평균(50.2)
        
문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
예 3) 2명
        
문제4) 인덱스를 입력받아 성적 출력
정답4) 인덱스 입력 : 1 성적 : 11점
        
문제5) 성적을 입력받아 인덱스 출력
정답5) 성적 입력 : 11 인덱스 : 1
        
문제6) 학번을 입력받아 성적 출력
정답6) 학번 입력 : 1003 성적 : 45점
        
문제7) 학번을 입력받아 성적 출력
단, 없는학번 입력 시 예외처리
예 7)
학번 입력 : 1002 성적 : 11점
학번 입력 : 1000 해당학번은 존재하지 않습니다.
        
문제8) 1등학생의 학번과 성적 출력
정답8) 1004번(98점)</pre>
            </li>
            <li>
                <pre>OMR카드[문제]
1. 배열 answer는 시험문제의 정답지이다.
2. 배열 student에 1~5 사이의 랜덤 숫자 5개를 저장한다.
3. answer와 student 값을 비교해 정오표를 출력한다.
4. 한 문제당 20점이다.
예)
answer  = {1, 3, 4, 2, 5}
student = {1, 1, 4, 4, 3}
정오표      = {O, X, O, X, X}
성적         = 40점</pre>
            </li>
            <li>
                <pre>영화관 좌석예매[문제]
1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
4. 한 좌석당 예매 가격은 12000원이다.
5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
예)
seat = 0 0 0 0 0 0 0

좌석선택 : 1
seat = 0 1 0 0 0 0 0

좌석선택 : 3
seat = 0 1 0 1 0 0 0

좌석선택 : 3
seat = 0 1 0 1 0 0 0
이미 예매가 완료된 자리입니다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡ
매출액 : 24000원</pre>
            </li>
        </ul>
    </div>
    <div>
        <h3>step7</h3>
        <ul>
            <li>
                <pre>학생성적관리 프로그램(1단계)[문제]
문제 1) 전체 합 리턴
정답 1) 362

문제 2) 4의 배수의 합 리턴
정답 2) 264
        
문제 3) 4의 배수의 개수 리턴
정답 3) 3
        
문제 4) 짝수의 개수 리턴
정답 4) 3</pre>
            </li>
            <li>
                <pre>학생성적관리 프로그램(2단계)[문제]
문제1) scores배열에 1~100점 사이의 정수를 5개 저장 메서드
예 1) 87, 11, 92, 14, 47

문제2) 전교생의 총점 리턴 메서드
예 2) 총점(251) 평균(50.2)
        
문제3) 전교생의 평균 리턴 메서드
예 3) 평균(50.2)
        
문제4) 성적이 60점 이상이면 합격. 합격생 수 리턴 메서드
예 4) 2명
        
문제5) 인덱스를 전달받아 성적 리턴 메서드
정답5) 인덱스 입력 : 1 성적 : 11점
        
문제6) 성적을 전달받아 인덱스 리턴 메서드단, 없는 성적 입력 시 예외처리
정답6) 성적 입력 : 11 인덱스 : 1
        
문제7) 학번을 전달받아 성적 리턴 메서드단, 없는학번 입력 시 예외처리예 7)학번 입력 : 1002 성적 : 11점
학번 입력 : 1000 해당 학번은 존재하지 않습니다.
        
문제9) 1등학생의 학번과 성적을 클래스 타입(Student 클래스)으로 리턴 메서드
정답9) 1004번(98점)</pre>
            </li>
            <li>
                <pre>OMR카드[문제]
1. 배열 answer는 시험문제의 정답지이다.
2. 배열 student에 1~5 사이의 랜덤 숫자 5개를 저장한다.
3. answer와 student 값을 비교해 정오표를 출력한다.
4. 한 문제당 20점이다.
예)
answer  = {1, 3, 4, 2, 5}
student = {1, 1, 4, 4, 3}
정오표      = {O, X, O, X, X}
성적         = 40점</pre>
            </li>
            <li>
                <pre>영화관 좌석예매[문제]
1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
4. 한 좌석당 예매 가격은 12000원이다.
5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
예)
seat = 0 0 0 0 0 0 0

좌석선택 : 1
seat = 0 1 0 0 0 0 0

좌석선택 : 3
seat = 0 1 0 1 0 0 0

좌석선택 : 3
seat = 0 1 0 1 0 0 0
이미 예매가 완료된 자리입니다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡ
매출액 : 24000원</pre>
            </li>
        </ul>
    </div>
    <div>
        <h3>step8</h3>
        <ul>
            <li>
                <pre>회원가입, 탈퇴, 정렬, 출력구현</pre>
            </li>
        </ul>
    </div>
