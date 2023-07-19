import 'dart:io';

main() {
  int n = int.parse(stdin.readLineSync()!);

  int temp = n, sum = 0;

  while (n != 0) {
    int i = n % 10;
    sum = sum + (i * i * i);
    n = (n / 10).toInt();
  }

  if (temp == sum) {
    print("Number is Armstrong");
  } else {
    print("Number is not Armstrong");
  }
}
