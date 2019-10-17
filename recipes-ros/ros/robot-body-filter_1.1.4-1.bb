DESCRIPTION = "Filters the robot's body out of laser scans or point clouds."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation fcl pcl-conversions pkgconfig tf2-eigen tf2-sensor-msgs dynamic-reconfigure filters geometric-shapes geometry-msgs laser-geometry pcl moveit-core moveit-ros-perception roscpp sensor-msgs std-msgs tf2 tf2-ros urdf visualization-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime fcl pcl-conversions"

SRC_URI = "https://github.com/peci1/robot_body_filter-release/archive/release/melodic/robot_body_filter/1.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d503df66fdf0d41abca328baabf4901d"
SRC_URI[sha256sum] = "f47798881bee0918fe1a575b3000d43479f89353c38af299518163611c422c16"

S = "${WORKDIR}/robot_body_filter-release-release-melodic-robot_body_filter-1.1.4-1"

inherit catkin
