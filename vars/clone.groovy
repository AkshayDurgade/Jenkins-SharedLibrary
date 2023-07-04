def call (String Url, String branch) {
    git branch: "${branch}", url: "${Url}" 
    echo "Cloning done"
}