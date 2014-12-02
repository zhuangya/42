#!/usr/bin/env bash
function _42(){
    return 42
}

_42 "life" "universe" "everything"
answer=$?
echo $answer
