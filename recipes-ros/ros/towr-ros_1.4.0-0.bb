DESCRIPTION = "A ROS dependent wrapper for"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libncurses-dev message-runtime message-generation std-msgs visualization-msgs roscpp rosbag xpp-states xpp-msgs towr"

RDEPENDS_${PN} = "xterm xpp-hyq  rqt-bag"

SRC_URI = "https://github.com/ethz-adrl/towr-release/archive/release/melodic/towr_ros/1.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3e833d0c4b29e11eef65e6b1100cfbbe"
SRC_URI[sha256sum] = "bc5d15bff32bd5836c651227fe8d737b00fe1f4d5c1e215f6d8913ba2f831dda"

ROS_SPN = "towr"
S = "${WORKDIR}/towr-release-release-melodic-towr_ros-1.4.0-0"

inherit catkin
