
do_patch[postfuncs] += "fix_system_include"

fix_system_include(){
    find ${S} -name 'CMakeLists.txt' -exec  sed -i -E 's/(include_directories\()SYSTEM\W/\1/g' {} \;
}
