DESCRIPTION = "A ROS dependent wrapper for"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libncurses-dev message-runtime message-generation std-msgs visualization-msgs roscpp rosbag xpp-states xpp-msgs towr"

RDEPENDS_${PN} = "xterm xpp-hyq  rqt-bag"

SRC_URI = "https://github.com/ethz-adrl/towr-release/archive/release/melodic/towr_ros/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e03572ec56fd2ae7351f89b6bc8414e3"
SRC_URI[sha256sum] = "fd30887f7c1a5dcd841ed043da22a724bc30cc47f3db12593a0da5d7a99ae854"

ROS_SPN = "towr"
S = "${WORKDIR}/towr-release-release-melodic-towr_ros-1.4.1-0"

inherit catkin
