DESCRIPTION = "Includes basic manipulation related structures as well as a few algorithms currently used at Yujin Robot."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-manipulators"

RDEPENDS_${PN} = "ecl-manipulators"

SRC_URI = "https://github.com/yujinrobot-release/ecl_manipulation-release/archive/release/melodic/ecl_manipulation/0.60.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b8c9127341112636389542ec04fc85cd"
SRC_URI[sha256sum] = "d8ab07c3933af9e3633c323a372ed18faa71d6c798769e2a9ce96175b5adb62b"

S = "${WORKDIR}/ecl_manipulation-release-release-melodic-ecl_manipulation-0.60.3-0"

inherit catkin
