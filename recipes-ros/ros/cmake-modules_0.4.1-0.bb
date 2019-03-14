DESCRIPTION = "A common repository for CMake Modules which are not distributed with CMake but are commonly used by ROS packages."
AUTHOR = "William Woodall"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/cmake_modules-release/archive/release/melodic/cmake_modules/0.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bee3644dc86ad5e55d40735049ccfffb"
SRC_URI[sha256sum] = "f967e92480eb619fe0442ca64000a820ad3370c38648c6e2f262e1353a5246b6"

S = "${WORKDIR}/cmake_modules-release-release-melodic-cmake_modules-0.4.1-0"

inherit catkin
