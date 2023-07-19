import 'dart:io';

main() {
  int n = int.parse(stdin.readLineSync()!);

  int result = 0, reminder = 0, q = n;

  while (q != 0) {
    reminder = q % 10;
    result = (result * 10) + reminder;
    q = (q / 10).toInt();
  }

  if (result == n) {
    print("Yes");
  } else {
    print("No");
  }
}
