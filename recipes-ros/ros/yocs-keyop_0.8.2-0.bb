DESCRIPTION = "Keyboard teleoperation for your robot"
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs std-msgs roscpp ecl-exceptions ecl-threads ecl-time geometry-msgs std-msgs roscpp ecl-exceptions ecl-threads ecl-time"

RDEPENDS_${PN} = "geometry-msgs std-msgs roscpp ecl-exceptions ecl-threads ecl-time"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_keyop/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd730b12776a15a0c37f8955007dd5a1"
SRC_URI[sha256sum] = "9b6de8d0572c1d3c31cca79bf6ad19f484cc7f0bbb4c6af27012f6eaf010f26d"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_keyop-0.8.2-0"

inherit catkin
