DESCRIPTION = "The ros client for the region of interest manager of the itempick and boxpick modules"
AUTHOR = "Carlos Xavier Garcia Briones"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "wxwidgets roscpp geometry-msgs shape-msgs visualization-msgs tf interactive-markers rc-common-msgs rc-pick-client"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_roi_manager_gui/2.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f7df67be1b34d9864f5005fe86750018"
SRC_URI[sha256sum] = "055874d511998280c8cbcb3fa00c30177f57489a2989737c15fec27099e56682"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_roi_manager_gui-2.7.0-1"

inherit catkin
