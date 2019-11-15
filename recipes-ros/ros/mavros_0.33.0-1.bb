DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS with proxy for Ground Control Station."
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "libeigen mavlink geographiclib geographiclib angles cmake-modules boost diagnostic-updater eigen-conversions libmavconn pluginlib rosconsole-bridge roscpp tf2-ros tf2-eigen diagnostic-msgs geometry-msgs mavros-msgs nav-msgs sensor-msgs geographic-msgs std-msgs std-srvs libeigen mavlink geographiclib geographiclib"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros/0.33.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "31602be35ae3d04f8024c1b8aa09fc49"
SRC_URI[sha256sum] = "b44ea8b760b5422e652c6ace145b1ac967bc77810f68f55cf04d3d2fdad5cf3a"

S = "${WORKDIR}/mavros-release-release-melodic-mavros-0.33.0-1"

inherit catkin
