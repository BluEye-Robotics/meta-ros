SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "89b5c18050ccde9c71d9afbe53d5105f"
SRC_URI[sha256sum] = "0c0ef15fc0d1b31920919cee0c3aeb33a5842ae99e41670eead013bbfd8f2994"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin ros-insane

ROS_SPN = "moveit"
