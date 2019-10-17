DESCRIPTION = "Messages, services, and actions used in the pr2_controllers stack."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs trajectory-msgs geometry-msgs message-generation actionlib-msgs trajectory-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "actionlib-msgs trajectory-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_controllers_msgs/1.10.17-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "943f4622dcaebc6c17366740c126d2cb"
SRC_URI[sha256sum] = "82561cde4b79968a9d87697c9a87487b9252480f072ae084497f383be300167f"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_controllers_msgs-1.10.17-1"

inherit catkin
