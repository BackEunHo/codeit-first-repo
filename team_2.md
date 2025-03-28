1-4 PR 실습

1.팀장이 GitHub에서 원격 repository 생성 (public 진행)
[main branch] 초기 내용을 간단하게 작성(프로젝트 생성) 후에 첫 번째 commit을 남기고, 원격 repository에 push
2.나머지 팀원들은 첫 번째 commit을 포함한 main 브랜치를 기준으로 원격 repository를 clone 해서 local에 환경을 준비
3.팀장을 포함한 모든 팀원들은 각자 main 브랜치에서 새로운 feature/*** 브랜치를 생성하여 작업 후 commit 하고, push 한다.
$ git push -u origin feature/***
4.각자 작업한 feature/*** 브랜치 → main 브랜치 병합하는 Pull Request 생성
서로 다른 팀원들의 PR 확인 후, Approve
5.Approve된 PR에 한해서 PR 생성자가 main에 merge
6.충돌 발생 시에 해결 시도
7.실습이 끝난 후 GitHub repository 링크를 팀장이 디스코드 #과제-업로드 채널에 공유
8. 이주용 PR실습
