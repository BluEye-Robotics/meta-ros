DESCRIPTION = "Provides service calls for getting ros meta-information, like list of topics, services, params, etc."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation"

RDEPENDS_${PN} = "rosbridge-library rospy rosnode rosgraph message-runtime"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosapi/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "886fb0cf8b1c185578509bdb73fcbeb5"
SRC_URI[sha256sum] = "c28e939e2812f04bbd9b115470edca0adf3b5ef8600633890aca838793940eb6"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosapi-0.11.1-1"

inherit catkin
