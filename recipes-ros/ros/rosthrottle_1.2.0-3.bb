DESCRIPTION = "ROS Python package for throttling ROS topics programatically in Python. Sits on top of the ros_comm topic_tools throttle utility."
AUTHOR = "Carson Schubert"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = ""

RDEPENDS_${PN} = "topic-tools"

SRC_URI = "https://github.com/UTNuclearRoboticsPublic/rosthrottle-release/archive/release/melodic/rosthrottle/1.2.0-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d8b6e10004204a4243e32c9af2866dd4"
SRC_URI[sha256sum] = "b4f4384cb8098eb9adc8e27e784f30df9059b7cb9709fa6fe75cb17ddc65011c"

S = "${WORKDIR}/rosthrottle-release-release-melodic-rosthrottle-1.2.0-3"

inherit catkin
