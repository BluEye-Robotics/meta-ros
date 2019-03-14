DESCRIPTION = "Joystick teleoperation for your robot robot core"
AUTHOR = "Marcus Liebhardt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp sensor-msgs std-msgs yocs-msgs ecl-exceptions ecl-time geometry-msgs joy roscpp sensor-msgs std-msgs yocs-msgs ecl-exceptions ecl-time"

RDEPENDS_${PN} = "geometry-msgs joy roscpp sensor-msgs std-msgs yocs-msgs ecl-exceptions ecl-time"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_joyop/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6ddb03072fa95b6278ca40fa0fe2d11c"
SRC_URI[sha256sum] = "e44414b71e3e378a83012afa9219ae787162895a4bab5bf7353528d07cc24ab7"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_joyop-0.8.2-0"

inherit catkin
