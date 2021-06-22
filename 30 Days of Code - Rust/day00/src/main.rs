/*
 * Created by Steven Jennings on 22 June 2021.
 */

/* Imports */
use std::io::{self, BufRead};

/* Main */
fn main() {
    let mut buffer = String::new();
    io::stdin().lock().read_line(&mut buffer).unwrap();
    println!("Hello, World.");
    println!("{}", buffer.trim());
}
