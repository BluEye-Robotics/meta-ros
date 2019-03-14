DESCRIPTION = "The robot_activity package implements ROS node lifecycle"
AUTHOR = "Maciej ZURAD"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint roscpp std-srvs robot-activity-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/snt-robotics/robot_activity-release/archive/release/melodic/robot_activity/0.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a9de29e1967ab2345dac59c2c80cdf7b"
SRC_URI[sha256sum] = "9aea7f4b03a74445c52faddfcd58ea086b7ad8af058a6a3749e9b992849a5361"

S = "${WORKDIR}/robot_activity-release-release-melodic-robot_activity-0.1.1-0"

inherit catkin
