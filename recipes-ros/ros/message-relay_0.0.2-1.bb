DESCRIPTION = "Package to programmatically spawn message, service, and action relays. To add support for a message/service dependency, please add to the build dependencies in package. xml and CMakeLists. txt"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-cheetah actionlib-msgs controller-manager-msgs diagnostic-msgs gazebo-msgs geometry-msgs map-msgs move-base-msgs multimaster-msgs nav-msgs robot-localization roscpp rosgraph-msgs sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs tf2-msgs trajectory-msgs visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/message_relay/0.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0bc0120cdd6088025c4ca5cfb4867bf2"
SRC_URI[sha256sum] = "1aa52fc974539d1900c9c31cab57960ae4461a2f07958187c1b9eae9b00d8877"

ROS_SPN = "cpr_multimaster_tools"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-melodic-message_relay-0.0.2-1"

inherit catkin
