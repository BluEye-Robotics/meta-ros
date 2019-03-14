DESCRIPTION = "Graft is not yet finished. It's intended to be a full replacement to robot_pose_ekf, including native absolute references, and arbitrary topic configuration. If you try to use Graft now, please note that not all parameters are configured and you will not always see a change in behavior by modifying the parameters."
AUTHOR = "Chad Rockey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules libeigen geometry-msgs message-generation nav-msgs rosconsole roscpp sensor-msgs tf dynamic-reconfigure geometry-msgs message-runtime nav-msgs rosconsole roscpp sensor-msgs tf"

RDEPENDS_${PN} = "dynamic-reconfigure geometry-msgs message-runtime nav-msgs rosconsole roscpp sensor-msgs tf"

SRC_URI = "https://github.com/ros-gbp/graft-release/archive/release/melodic/graft/0.2.3-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "134b2807123daf67c4cdd2cb2a9f07b5"
SRC_URI[sha256sum] = "9a8974a928fe75527071337fedbe94266631129c0a1b9cb9d9163b06302bedce"

S = "${WORKDIR}/graft-release-release-melodic-graft-0.2.3-2"

inherit catkin
