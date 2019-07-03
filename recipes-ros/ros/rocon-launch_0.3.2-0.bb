DESCRIPTION = "A multi-roslaunch (for single and multi-master systems)."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-catkin-pkg rospy roslaunch rocon-console rocon-python-utils rosbash"

RDEPENDS_${PN} = "rospy roslaunch rocon-console rocon-python-utils rosbash"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_launch/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9057371eeda7cb24743c8ad85aa0e086"
SRC_URI[sha256sum] = "8239a56fd334d32336db287785c12fa526ce2e4c792fb91ff2c3687dec8b2945"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_launch-0.3.2-0"

inherit catkin
