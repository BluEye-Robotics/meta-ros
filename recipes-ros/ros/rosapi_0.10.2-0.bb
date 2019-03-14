DESCRIPTION = "Provides service calls for getting ros meta-information, like list of topics, services, params, etc."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation"

RDEPENDS_${PN} = "rosbridge-library rospy rosnode rosgraph message-runtime"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosapi/0.10.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "778f6a27cbc8e1c64606a75a123a2372"
SRC_URI[sha256sum] = "6dcfd49efe256bb3ffc4316a5c14dc704845363eaaa63f0ddd0c3f5cbd53fb7e"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosapi-0.10.2-0"

inherit catkin
