
do_patch[postfuncs] += "fix_cmake_boost_signals"

fix_cmake_boost_signals(){
    find ${S} -name 'CMakeLists.txt' -exec  sed -i -E 's/(find_package\(Boost\ .*\s)signals(.*\))/\1\2/g' {} \;
}
