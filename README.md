## Financial Services

- "Spring Framework"를 공부하기 위해서 만든 프로젝트

[API 정의서](#API-정의서)

### API 정의서

### Join

Request

URL

```http
POST /member/join
Host: http://localhost:8080
```

Paramater

| Name       | Type   | Description   | Required |
| ---------- | ------ | ------------- | -------- |
| member_num | Long   | 고객 번호     | 0        |
| id         | String | 고객 아이디   | 0        |
| name       | String | 고객 이름     | 0        |
| phone_num  | String | 고객 전화번호 | 0        |
| password   | String | 고객 비밀번호 | 0        |

Response

Key (수정중...)

| Name | Type | Description |
| ---- | ---- | ----------- |
|      |      |             |
|      |      |             |

### Find

Request

URL

```http
POST /member/find
Host: http://localhost:8080
```

Paramater

| Name | Type   | Description | Required |
| ---- | ------ | ----------- | -------- |
| id   | String | 고객 아이디 | 0        |

Response

Key

| Name       | Type   | Description   |
| ---------- | ------ | ------------- |
| member_num | Long   | 고객 번호     |
| id         | String | 고객 아이디   |
| name       | String | 고객 이름     |
| phone_num  | String | 고객 전화번호 |
| password   | String | 고객 비밀번호 |

### Open

Request

URL

```http
POST /account/open
Host: http://localhost:8080
```

Paramater

| Name | Type   | Description | Required |
| ---- | ------ | ----------- | -------- |
| member_num   | Long | 고객 번호 | 0        |
| account_pw   | int | 고객 계좌 비밀번호 | 0        |
| balance   | Long | 고객 계좌 잔액 | 0        |
| available   | boolean | 고객 계좌 사용 가능 여부 | 0        |

Response

Key

| Name       | Type   | Description   |
| ---------- | ------ | ------------- |
| member_num   | Long | 고객 번호 |
| account_num   | String | 고객 계좌 번호 |
| account_pw   | int | 고객 계좌 비밀번호 |
| balance   | Long | 고객 계좌 잔액 |
| available   | boolean | 고객 계좌 사용 가능 여부 |

### Rest

Request

URL

```http
POST /account/rest
Host: http://localhost:8080
```

Paramater

| Name | Type   | Description | Required |
| ---- | ------ | ----------- | -------- |
| member_num   | Long | 고객 번호 | 0        |
| account_num   | String | 고객 계좌 번호 | 0        |

Response

Key

| Name       | Type   | Description   |
| ---------- | ------ | ------------- |
| result   | String | fail, success |

### Find Account

Request

URL

```http
POST /account/findAccount
Host: http://localhost:8080
```

Paramater

| Name | Type   | Description | Required |
| ---- | ------ | ----------- | -------- |
| memberNum   | Long | 고객 번호 | 0        |

Response

Key

| Name       | Type   | Description   |
| ---------- | ------ | ------------- |
| member_num   | Long | 고객 번호 |
| account_num   | String | 고객 계좌 번호 |
| account_pw   | int | 고객 계좌 비밀번호 |
| balance   | Long | 고객 계좌 잔액 |
| available   | boolean | 고객 계좌 사용 가능 여부 |