DESCRIPTION = "This package contains common nodelet tools such as a mux, demux and throttle."
AUTHOR = "Radu Bogdan Rusu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost dynamic-reconfigure message-filters nodelet pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/melodic/nodelet_topic_tools/1.9.16-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "53c981d735eb483c285efef89032f248"
SRC_URI[sha256sum] = "39f55bdfb39c520b29a3c6004ca8d359a2e2ffc8da9ed254ba38c180bd035ae3"

ROS_SPN = "nodelet_core"
S = "${WORKDIR}/nodelet_core-release-release-melodic-nodelet_topic_tools-1.9.16-0"

inherit catkin
