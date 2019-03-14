DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS with proxy for Ground Control Station."
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "libeigen mavlink geographiclib geographiclib angles cmake-modules boost diagnostic-updater eigen-conversions libmavconn pluginlib rosconsole-bridge roscpp tf2-ros tf2-eigen diagnostic-msgs geometry-msgs mavros-msgs nav-msgs sensor-msgs geographic-msgs std-msgs std-srvs libeigen mavlink geographiclib geographiclib"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros/0.29.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d70ec153d55c64e84c6a5e8129ed5f6b"
SRC_URI[sha256sum] = "7999a1395dc5dfddba5225bcea8be7816ad1bf15a9221b1e0ac3d7fe2dad53e3"

S = "${WORKDIR}/mavros-release-release-melodic-mavros-0.29.2-0"

inherit catkin
