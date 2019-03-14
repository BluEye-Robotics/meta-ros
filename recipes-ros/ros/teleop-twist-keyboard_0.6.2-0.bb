DESCRIPTION = "Generic keyboard teleop for twist robots."
AUTHOR = "Graylin Trevor Jay"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs rospy"

RDEPENDS_${PN} = "geometry-msgs rospy"

SRC_URI = "https://github.com/ros-gbp/teleop_twist_keyboard-release/archive/release/melodic/teleop_twist_keyboard/0.6.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "66b86d71b03474c40fd799ac16626b67"
SRC_URI[sha256sum] = "4e15fb28b816cb89a86f7318b75a23d933e6f732ff0072604a967f10681e9203"

S = "${WORKDIR}/teleop_twist_keyboard-release-release-melodic-teleop_twist_keyboard-0.6.2-0"

inherit catkin
