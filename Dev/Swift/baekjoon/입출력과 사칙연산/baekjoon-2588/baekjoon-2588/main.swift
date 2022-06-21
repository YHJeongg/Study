//
//  main.swift
//  baekjoon-2588
//
//  Created by Jeong Yun Hyeon on 2022/02/25.
//

import Foundation
let line1 = readLine()!
let line2 = Array(readLine()!).map{Int(String($0))!}

let a = Int(line1)!
let b = Int(line2[2])
let c = Int(line2[1])
let d = Int(line2[0])

print(a * b)
print(a * c)
print(a * d)
print((a * b) + (a * c * 10) + (a * d * 100))
