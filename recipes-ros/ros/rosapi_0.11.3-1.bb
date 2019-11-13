DESCRIPTION = "Provides service calls for getting ros meta-information, like list of topics, services, params, etc."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation"

RDEPENDS_${PN} = "rosbridge-library rospy rosnode rosgraph message-runtime"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosapi/0.11.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6bb685d31846ce2e322594123001ea2d"
SRC_URI[sha256sum] = "52cf4c91178e2a736bba78bf73454a377eabccc48621baa9445e04c6431c11f9"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosapi-0.11.3-1"

inherit catkin
