DESCRIPTION = "Navigation module for robots"
AUTHOR = "Jihoon Lee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy roscpp actionlib tf yocs-math-toolkit move-base-msgs nav-msgs yocs-msgs rospy roscpp actionlib tf yocs-math-toolkit move-base-msgs yocs-msgs nav-msgs"

RDEPENDS_${PN} = "rospy roscpp actionlib tf yocs-math-toolkit move-base-msgs yocs-msgs nav-msgs"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_navigator/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a9496c647329212d02fec287de7fd92"
SRC_URI[sha256sum] = "ce9cacbbb9e4456865e0c8591d0dc48d821e1823a97127deb9963bb6f3a5a75a"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_navigator-0.8.2-0"

inherit catkin
