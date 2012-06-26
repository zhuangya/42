#import <Foundation/Foundation.h>
// Compile with llvm 4+: clang -framework Foundation _42.m

@interface _42 : NSObject
@property (retain) id __42;
@end

@implementation _42
- (id)init {
    if ( (self = [super init]) ) {
        ___42 = @42;
    }
    return self;
}
@end 

int main(void) {
    _42 *__42 = [[_42 alloc] init];
    NSLog(@"%@", [__42 __42]);
    return 0;
}
