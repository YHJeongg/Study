
import Foundation

let multiply = {(val1: Int, val2: Int) -> Int in
    return val1 * val2
}
var result = multiply(10, 20)
print(result)

let add = {(val1: Int, val2: Int) -> Int in
    return val1 + val2
}
result = add(10, 20)
print(result)

func math(x: Int, y: Int, cal: (Int, Int) -> Int) -> Int {
    return cal(x, y)
}
result = math(x: 10, y: 20, cal: add)
print(result)
result = math(x: 10, y: 20, cal: multiply)
print(result)

result = math(x: 10, y: 20, cal: {(val1: Int, val2: Int) -> Int in
    return val1 + val2
})
print(result)

result = math(x: 10, y: 20) {(val1: Int, val2: Int) -> Int in
    return val1 + val2
} // trailing closure
print(result)

result = math(x: 10, y: 20, cal: {(val1: Int, val2: Int) in
    return val1 + val2
}) // 리턴형 생략
print(result)

result = math(x: 10, y: 20) {(val1: Int, val2: Int) in
    return val1 + val2
} // trailing closure, 리턴형 생략
print(result)

result = math(x: 10, y: 20, cal: {
    return $0 + $1
}) // 매개변수 생략하고 단축인자(shorthand argument name)사용
print(result)

result = math(x: 10, y: 20) {
    return $0 + $1
} // trailing closure, 매개변수 생략하고 단축인자사용
print(result)

result = math(x: 10, y: 20, cal: {
    $0 + $1
}) // 클로저에 리턴값이 있으면 마지막 줄을 리턴하므로 return 생략
print(result)

result = math(x: 10, y: 20) {$0 + $1} // return 생략
print(result)
