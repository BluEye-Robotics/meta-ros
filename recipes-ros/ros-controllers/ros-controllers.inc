SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c67cfc6afc89c646ac27fc7f20f7520f"
SRC_URI[sha256sum] = "da528db3ff42d1ac8b58dfaa56ac6116367346e36523fad6c108976ebe81e2dc"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_controllers"
