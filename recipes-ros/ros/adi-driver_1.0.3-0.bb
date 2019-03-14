DESCRIPTION = "The adi_driver package"
AUTHOR = "Ryosuke Tajima"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs roslint std-srvs imu-filter-madgwick rviz-imu-plugin roscpp rqt-plot  sensor-msgs xacro std-srvs"

RDEPENDS_${PN} = "imu-filter-madgwick rviz-imu-plugin roscpp rqt-plot  sensor-msgs xacro std-srvs"

SRC_URI = "https://github.com/tork-a/adi_driver-release/archive/release/melodic/adi_driver/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0e7147ffa1a58ce9bc9321e75ba6a0f9"
SRC_URI[sha256sum] = "6f2b565c98396653f9364c57fddafa0ca244781c27edd5b5467502fa77dafc9a"

S = "${WORKDIR}/adi_driver-release-release-melodic-adi_driver-1.0.3-0"

inherit catkin
