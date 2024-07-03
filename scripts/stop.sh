#!/usr/bin/env bash

PROJECT_ROOT="/home/ubuntu/app"
JAR_FILE="$PROJECT_ROOT/algo-mixing-and-solving.jar" # 여기서 프로젝트 이름은 일단 원하는 프로젝트 이름으로 설정해주세요. 밑에서 추가 설명하겠습니다.

DEPLOY_LOG="$PROJECT_ROOT/deploy.log"

TIME_NOW=$(date +%c)

# 현재 구동 중인 애플리케이션 pid 확인
CURRENT_PID=$(pgrep -f $JAR_FILE)

# 프로세스가 켜져 있으면 종료
if [ -z $CURRENT_PID ]; then
  echo "$TIME_NOW > 현재 실행중인 애플리케이션이 없습니다" >> $DEPLOY_LOG
else
  echo "$TIME_NOW > 실행중인 $CURRENT_PID 애플리케이션 종료 " >> $DEPLOY_LOG
  kill -15 $CURRENT_PID
fi
