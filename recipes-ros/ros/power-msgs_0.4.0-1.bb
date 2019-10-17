DESCRIPTION = "ROS messages for power measurement and breaker control."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs message-runtime"

SRC_URI = "https://github.com/fetchrobotics-gbp/power_msgs-release/archive/release/melodic/power_msgs/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2071c86e0da7899cc1e9caf12fea34c9"
SRC_URI[sha256sum] = "77dade4006aa8238980b62f305d04ffbcfd460fedaed7dba6ebd9db7bb59a299"

S = "${WORKDIR}/power_msgs-release-release-melodic-power_msgs-0.4.0-1"

inherit catkin
