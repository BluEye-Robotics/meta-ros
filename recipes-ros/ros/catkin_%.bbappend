DEPENDS += "${PYTHON_PN}-empy-native ${PYTHON_PN}-catkin-pkg-native"

SRC_URI += "\
    file://0002-use-python-provided-by-environment-instead-of-the-ge.patch \
    file://0003-avoid-using-host-s-paths-when-cross-compiling.patch \
    file://0004-relocate-dependency-s-headers-to-current-sysroot.patch \
    ${@'file://0005-python.cmake-look-for-python3-first.patch' if d.getVar('PYTHON_PN', True) == 'python3' else ''} \
    "

BBCLASSEXTEND += "native"
