package main

import "fmt"

func _42(__42 interface{}) int{
    return 42
}

func main() {
    fmt.Println(_42("42"))
}
