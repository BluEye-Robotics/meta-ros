DESCRIPTION = "Simple tool for waypoints navigation with two functions:"
AUTHOR = "Jorge Santos Simon"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "tf roscpp actionlib nav-msgs geometry-msgs move-base-msgs actionlib-msgs visualization-msgs yocs-math-toolkit yocs-msgs tf roscpp actionlib nav-msgs geometry-msgs move-base-msgs actionlib-msgs visualization-msgs yocs-math-toolkit yocs-msgs"

RDEPENDS_${PN} = "tf roscpp actionlib nav-msgs geometry-msgs move-base-msgs actionlib-msgs visualization-msgs yocs-math-toolkit yocs-msgs"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_waypoints_navi/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1db495980f99efc49ad922de0c743006"
SRC_URI[sha256sum] = "b0134c5b12ed2067775780964a54a4d339efc42bcb4481b013913c93550f0e96"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_waypoints_navi-0.8.2-0"

inherit catkin
