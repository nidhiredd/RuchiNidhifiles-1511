// function demo(){
//     console.log(" this is a demo function.");
// }
// demo();

// function demo(){
//     return " this is a demo function.";
// }
// console.log(demo());

// function demo(a){
// console.log(a);
// }
// demo(" this is a demo function.");

// function demo(a){
// console.log(a);
// }
// let a =" this is a demo function.";
// demo(a);



// function demo(a,b){
//     return a+b;
// }
// let a =" this is a demo function.";
// let b =" welcome to functions topic.";
// console.log(demo(a,b)); 



// function add(x,y){
//     console.log(x+y);
// }
// add(5,10);
// add(20,30);



// function multiply(x,y){
//     return x*y;
// }
// console.log(multiply(5,10));
// console.log(multiply(20,30));



// function subtract(x,y){
//     return x-y;
// }
// let result1 = subtract(10,5);
// let result2 = subtract(30,20);
// console.log(result1);
// console.log(result2);   
// console.log(subtract(50,25));



//  function divide(x,y){
//     console.log(x/y);
//  }
//  divide(10,5);



//  dem();
//  function dem(){
//     console.log(" hello ");
//  }


// function fact(n){
//     let f=1;
//     for(let i=1;i<=n;i++){
//         f=f*i;
//     }
//     return f;   
// }
// console.log(fact(5));
// console.log(fact(6));
// console.log(fact(7));
// console.log(fact(8));   
// console.log(fact(9));
// console.log(fact(10));



//function  stored in variable
// let a1 = function(){
//     console.log(" function stored in variable ");
// }
// a1();


//function stored in paranthesis
// (function(){
//     console.log(" function stored in paranthesis ");
// })(); 



// function stored in variable and named function
// let a = function demo(){
//     return " hello";
// }
// console.log(a());


// (function(x,y){
//     console.log(x+y);
// })(2,3); 


//arrow function  for add
// let add = (x,y) => x+y;
// console.log(add(5,10)); 


// let add1 = () => {
// console.log("hello world!");}
// add1();


//  let a5=()=>"hey! hi ";
//  console.log(a5());


//  let a6=()=>
//     { return "hey! hi ";}
//  console.log(a6());


//  let a7= x =>{return x;}
//     console.log(a7(12)); 

// let a8= (x2,x3)=> x2+x3;
// console.log(a8(10,20));


// let a9= x4 => {
//     return x4*x4;
// }
// console.log(a9(5));


//call back function
// function demo1(x,callback){
//     console.log(x);
//     callback();
// }
// function demo2(){
//     console.log(" this is callback function ");
// }
// demo1(5,demo2);


//same callback function using two 
// function demo3(x,callback1,callback2){
//     console.log(x);
//     callback1();
//     callback2();    
// }
// function demo4(){
//     console.log("this is  first call back function.");
// }
// function demo5(){
//     console.log(" this is second call back function.");
// }
// demo3(25,demo4,demo5);


//using only one call back function
// function demo6(callback){
//     callback();}
// function demo7(){
//     console.log(" this is only call back function. ");
// }
// demo6(demo7);

//compostion function
// function add(x){
//     return x+2;
// }
// function multiply(y){
//     return y*3;
// }
// let result = multiply(add(5));
// console.log(result);
// let result1 = add(multiply(5));
// console.log(result1);   

//function inside function
// function outer(){
//     function inner(){
//         console.log(" this is inner function ");
//     }
//     inner();
//     console.log(" this is outer function ");
// }
// outer();

//array of functions
// let arr = [1,2,4,65,43];
// console.log(arr);
// console.log(arr.length);
// console.log(arr[2]);
// console.log(arr.push(100));
// console.log(arr);
// console.log(arr.pop());
// console.log(arr);       


//arrays of functions
// let arr = [1,2,4,65,43];
// for(let i in arr){
//     console.log(i,arr[i]);
// }
// arr.shift();
// console.log(arr);
// arr.unshift(10);
// console.log(arr);

// arr.splice(2,0,99);
// console.log(arr);
// arr.splice(3,1);
// console.log(arr);   
// arr.sort();// only sees first digit
// console.log(arr);
// arr.reverse();
// console.log(arr);

// console.log(arr.indexOf(65));
// console.log(arr.concat([200,300,400]));
// console.log(arr.lastIndexOf(99));


//day10.html
//day10.js
//function in an array
// let arr=[1,2,3,"sruthi",function greet(){
//     return "Enjoy learning functions!";
// },1000,[10,20,30]];
// console.log(arr);
// console.log(arr[3]);
// console.log(arr[4]());
// console.log(arr[6][1]);    


// let arr=[10,20,78,43,67,90];
// arr.forEach((value,index) =>{
//     console.log(index,value);
// });


// let arr=[10,20,78,43,67,90];
// let  a= arr .filter((x)=>x>30);
// console.log(a);


// let arr=[10,20,78,43,67,90];
// let  a= arr .map((x)=>x*2);
// console.log(a); 
// console.log(arr);


// let arr=[10,20,78,43,67,90];
// let a=arr .find((x)=>x>50);
// console.log(a);


// let arr=[10,20,78,43,67,90];
// let a=arr .reduce((mul,x)=>mul*x,1);
// console.log(a);

// let arr=[10,20,30,46,21,34,54];
// for( i=0;i<arr.length;i++){
//     if(arr[i]>30)
//         console.log(arr[i]);
// }


//array  type conversions
// let arr1="hello everyone";
// let arr2="hi";
// console.log(arr1.length);
// console.log(arr1.charAt(4));
// console.log(arr1.toUpperCase());
// console.log(arr1.toLowerCase());
// console.log(arr1.lastIndexOf('l'));
// console.log(arr1.repeat(3));
// console.log(arr1.replaceAll("hello","hi"));
// console.log(arr1.substring(6,11));
// console.log(arr1.trim());
// console.log(arr1.split(" "));
// console.log(arr1.slice(1,7));
// console.log(arr1.search("v"));


// let str1="such a good intro";
// console.log(str1.length);
// let c=0;
// for(i=0;i<=str1.length;i++){
//     if(str1.charAt(i)==(" "))
//         c++;
// }console.log(c+1);


// let a={name:"nidhi",age: 22,place: "india",arr:[1,2,3,4,5],greet:function(){return "hello all"},obj:{a1:100,a2:300}};
// console.log(a.obj?.a2);


// let arr1=[1,2];
// let arr2=[4,5];
// let arr3=[...arr1,...arr2];
// console.log(arr3);


let a={name:"nidhi",age: 22,place: "india"};
console.log(Object.entries(a));
console.log(Object.keys(a));
console.log(Object.values(a));
console.log(Object.is(1,0));


let a1={name:"vishnu vardhan",age:27,place:"manchiryal"};
console.log(a1);
let {name:name1,age:ge1,place:place1,branch="cse"}=a1;
console.log(name1,ge1,place1);

let a2={name:"vishnu vardhan",age:27,place:"manchiryal"};




