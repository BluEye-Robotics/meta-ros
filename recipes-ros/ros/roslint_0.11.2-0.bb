DESCRIPTION = "CMake lint commands for ROS packages. The lint commands perform static checking of Python or C++ source code for errors and standards compliance."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/roslint-release/archive/release/melodic/roslint/0.11.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1fdf32c603fdedc8566b4f70fb13b83c"
SRC_URI[sha256sum] = "85588e28bc32d5359340c5524437aa447aadbd15f25c30d9e6cb4030f49232a5"

S = "${WORKDIR}/roslint-release-release-melodic-roslint-0.11.2-0"

inherit catkin
