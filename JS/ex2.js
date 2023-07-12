/*
const browserType = "mozilla";

if (browserType.includes("zilla")) {
  console.log("Found zilla!");
} else {
  console.log("No zilla here!");
}
*/

const browserType = "mozilla";

if (browserType.endsWith("zilla")) {
  console.log("Found zilla!");
} else {
  console.log("No zilla here!");
}
