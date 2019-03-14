DESCRIPTION = "Navigation Layer for Range sensors like sonar and IR"
AUTHOR = "David!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles costmap-2d dynamic-reconfigure geometry-msgs pluginlib roscpp rospy sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wu-robotics/navigation_layers_release/archive/release/melodic/range_sensor_layer/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "84a87ee532ce8a49dc4b1b4a4a0fca98"
SRC_URI[sha256sum] = "8e94872327b9579a9ca65c6aefe659bfffb7544a61ddca67580e8707af85d2e7"

ROS_SPN = "navigation_layers"
S = "${WORKDIR}/navigation_layers_release-release-melodic-range_sensor_layer-0.5.0-0"

inherit catkin
