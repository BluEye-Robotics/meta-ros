DESCRIPTION = "An easy wrapper for using parameters in ROS."
AUTHOR = "Claudio Bandera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest catkin"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/cbandera/rosparam_handler-release/archive/release/melodic/rosparam_handler/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f62b3f282bffdcd988c4c744a1ac3bc"
SRC_URI[sha256sum] = "b11ba2d257e5c7fc2c50f3e9eea117867178ed67a74906e21ebfad9f222f3fba"

S = "${WORKDIR}/rosparam_handler-release-release-melodic-rosparam_handler-0.1.4-1"

inherit catkin
