import Foundation

func solution(_ s:String) -> Int {
    
    let numArray = ["zero","one","two","three","four","five","six","seven","eight","nine"]
    var result = s
    
    for i in 0..<numArray.count {
        result = result.replacingOccurrences(of: numArray[i], with: "\(i)")
        print(result)
    }
    
    return Int(result)!
    
}
