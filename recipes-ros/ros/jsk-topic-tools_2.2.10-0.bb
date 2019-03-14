DESCRIPTION = "jsk_topic_tools"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs diagnostic-updater dynamic-reconfigure dynamic-tf-publisher eigen-conversions geometry-msgs image-transport message-generation nodelet roscpp roslaunch rosnode rostest rostime rostopic std-msgs std-srvs tf topic-tools diagnostic-msgs diagnostic-updater dynamic-reconfigure dynamic-tf-publisher eigen-conversions geometry-msgs image-transport message-runtime nodelet  python-scipy python-numpy roscpp roslaunch rosnode rostime rostopic sound-play sensor-msgs std-msgs std-srvs tf topic-tools"

RDEPENDS_${PN} = "diagnostic-msgs diagnostic-updater dynamic-reconfigure dynamic-tf-publisher eigen-conversions geometry-msgs image-transport message-runtime nodelet  python-scipy python-numpy roscpp roslaunch rosnode rostime rostopic sound-play sensor-msgs std-msgs std-srvs tf topic-tools"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_topic_tools/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "22a211dc67cefb85969aefa5add9502a"
SRC_URI[sha256sum] = "d2f76dd70a0b02a05b56658211cc0c8441dca5bea008d0ea45694d3c4cefa5e7"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_topic_tools-2.2.10-0"

inherit catkin
